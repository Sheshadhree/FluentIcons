package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonRibbon20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonRibbon20",
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
            moveToRelative(-4.991f, 9f)
            curveTo(3.903f, 11f, 3f, 11.887f, 3f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(6.417f, 17.614f, 8.145f, 18f, 10f, 18f)
            curveToRelative(1.061f, 0f, 2.081f, -0.126f, 3f, -0.388f)
            verticalLineToRelative(-1.967f)
            curveToRelative(-0.622f, -0.705f, -1f, -1.631f, -1f, -2.646f)
            curveToRelative(0f, -0.728f, 0.195f, -1.41f, 0.535f, -1.999f)
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
