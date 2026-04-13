package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Beaker20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Beaker20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3.5f)
            curveTo(5.5f, 3.224f, 5.724f, 3f, 6f, 3f)
            horizontalLineToRelative(8f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.276f, 4f, 14f, 4f)
            horizontalLineToRelative(-0.996f)
            verticalLineToRelative(4.684f)
            curveToRelative(0f, 0.58f, 0.144f, 1.15f, 0.42f, 1.66f)
            lineTo(14.315f, 12f)
            horizontalLineTo(5.684f)
            lineToRelative(0.89f, -1.653f)
            curveToRelative(0.276f, -0.51f, 0.42f, -1.081f, 0.42f, -1.66f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            curveTo(5.724f, 4f, 5.5f, 3.776f, 5.5f, 3.5f)
            close()
            moveTo(5.146f, 13f)
            lineToRelative(-0.964f, 1.79f)
            curveToRelative(-0.539f, 1f, 0.184f, 2.212f, 1.32f, 2.212f)
            horizontalLineToRelative(8.997f)
            curveToRelative(1.135f, 0f, 1.858f, -1.213f, 1.32f, -2.212f)
            lineTo(14.854f, 13f)
            horizontalLineTo(5.146f)
            close()
        }
    }.build()
}
