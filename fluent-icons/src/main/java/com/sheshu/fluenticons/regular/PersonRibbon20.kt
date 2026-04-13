package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.PersonRibbon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.PersonRibbon20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveTo(7.79f, 2f, 6f, 3.79f, 6f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveTo(7f, 6f)
            curveToRelative(0f, -1.657f, 1.343f, -3f, 3f, -3f)
            reflectiveCurveToRelative(3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            close()
            moveToRelative(-1.991f, 5f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(1.061f, 0f, 2.081f, -0.126f, 3f, -0.388f)
            verticalLineToRelative(-1.045f)
            curveTo(12.128f, 16.852f, 11.108f, 17f, 10f, 17f)
            curveToRelative(-1.735f, 0f, -3.257f, -0.364f, -4.327f, -1.047f)
            curveTo(4.623f, 15.283f, 4f, 14.31f, 4f, 13f)
            curveToRelative(0f, -0.553f, 0.448f, -1f, 1.009f, -1f)
            horizontalLineToRelative(7.117f)
            curveToRelative(0.091f, -0.355f, 0.23f, -0.69f, 0.409f, -1f)
            horizontalLineTo(5.009f)
            close()
            moveTo(16f, 16f)
            curveToRelative(1.657f, 0f, 3f, -1.344f, 3f, -3f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            reflectiveCurveToRelative(-3f, 1.343f, -3f, 3f)
            curveToRelative(0f, 1.656f, 1.343f, 3f, 3f, 3f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(0.729f, 0f, 1.412f, -0.196f, 2f, -0.536f)
            verticalLineToRelative(2.285f)
            curveToRelative(0f, 0.194f, -0.211f, 0.314f, -0.378f, 0.215f)
            lineTo(16f, 18f)
            lineToRelative(-1.622f, 0.965f)
            curveTo(14.21f, 19.064f, 14f, 18.944f, 14f, 18.75f)
            verticalLineToRelative(-2.285f)
            curveTo(14.588f, 16.805f, 15.271f, 17f, 16f, 17f)
            close()
        }
    }.build()
}
