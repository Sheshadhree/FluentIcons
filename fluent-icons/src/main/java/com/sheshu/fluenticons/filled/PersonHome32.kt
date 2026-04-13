package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonHome32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonHome32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(15f, 16f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            reflectiveCurveToRelative(-7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            close()
            moveTo(3f, 21.5f)
            verticalLineTo(22f)
            curveToRelative(0f, 2.393f, 1.523f, 4.417f, 3.685f, 5.793f)
            curveTo(8.859f, 29.177f, 11.802f, 30f, 15f, 30f)
            curveToRelative(0.178f, 0f, 0.353f, -0.012f, 0.529f, -0.017f)
            curveToRelative(-0.007f, -0.079f, -0.029f, -0.153f, -0.029f, -0.233f)
            verticalLineToRelative(-6.48f)
            curveToRelative(0f, -0.919f, 0.401f, -1.787f, 1.102f, -2.381f)
            lineTo(20f, 18f)
            horizontalLineTo(6.5f)
            curveTo(4.567f, 18f, 3f, 19.567f, 3f, 21.5f)
            close()
            moveToRelative(19.448f, -3.612f)
            curveToRelative(0.607f, -0.516f, 1.498f, -0.516f, 2.105f, 0f)
            lineToRelative(4.875f, 4.144f)
            curveToRelative(0.363f, 0.309f, 0.573f, 0.761f, 0.573f, 1.238f)
            verticalLineToRelative(6.48f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-2f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            verticalLineTo(26.5f)
            curveToRelative(0f, -0.551f, -0.445f, -0.998f, -0.996f, -1f)
            horizontalLineToRelative(-2.009f)
            curveToRelative(-0.55f, 0.002f, -0.996f, 0.449f, -0.996f, 1f)
            verticalLineToRelative(3.25f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            horizontalLineToRelative(-2f)
            curveTo(17.56f, 31f, 17f, 30.44f, 17f, 29.75f)
            verticalLineToRelative(-6.48f)
            curveToRelative(0f, -0.477f, 0.209f, -0.929f, 0.573f, -1.238f)
            lineToRelative(4.875f, -4.144f)
            close()
        }
    }.build()
}
