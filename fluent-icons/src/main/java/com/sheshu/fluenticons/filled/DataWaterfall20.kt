package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataWaterfall20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataWaterfall20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.5f)
            curveTo(1f, 3.224f, 1.224f, 3f, 1.5f, 3f)
            horizontalLineTo(7f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(4.5f)
            horizontalLineToRelative(6f)
            curveToRelative(1.035f, 0f, 2f, 0.741f, 2f, 1.8f)
            verticalLineTo(16f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(18.776f, 17f, 18.5f, 17f)
            horizontalLineTo(13f)
            curveToRelative(-1.035f, 0f, -2f, -0.741f, -2f, -1.8f)
            verticalLineToRelative(-4.7f)
            horizontalLineTo(5f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineTo(4f)
            horizontalLineTo(1.5f)
            curveTo(1.224f, 4f, 1f, 3.776f, 1f, 3.5f)
            close()
        }
    }.build()
}
