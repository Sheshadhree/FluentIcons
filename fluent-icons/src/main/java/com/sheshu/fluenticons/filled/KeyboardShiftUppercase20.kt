package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.KeyboardShiftUppercase20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.KeyboardShiftUppercase20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11.144f, 2.53f)
            curveToRelative(-0.6f, -0.707f, -1.69f, -0.707f, -2.288f, 0f)
            lineToRelative(-6.617f, 7.803f)
            curveToRelative(-0.55f, 0.65f, -0.089f, 1.647f, 0.763f, 1.647f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.017f)
            curveToRelative(0f, 0.552f, 0.447f, 1f, 1f, 1f)
            horizontalLineToRelative(6f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            verticalLineTo(11.98f)
            horizontalLineToRelative(2.996f)
            curveToRelative(0.852f, 0f, 1.314f, -0.997f, 0.763f, -1.647f)
            lineTo(11.144f, 2.53f)
            close()
            moveTo(6.5f, 17f)
            curveTo(6.224f, 17f, 6f, 17.224f, 6f, 17.5f)
            reflectiveCurveTo(6.224f, 18f, 6.5f, 18f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(13.776f, 17f, 13.5f, 17f)
            horizontalLineToRelative(-7f)
            close()
        }
    }.build()
}
