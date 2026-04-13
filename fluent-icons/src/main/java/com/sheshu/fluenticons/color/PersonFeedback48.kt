package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.PersonFeedback48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.PersonFeedback48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.125321f to Color(0xFF9C6CFE),
                    1f to Color(0xFF7A41DC)
                ),
                start = Offset(9.1829f, 31.8611f),
                end = Offset(13.9855f, 46.1028f)
            )
        ) {
            moveTo(3f, 34.79f)
            curveTo(3f, 34.88f, 3.15f, 44f, 16f, 44f)
            reflectiveCurveToRelative(13f, -9.12f, 13f, -9.21f)
            verticalLineToRelative(-1.04f)
            curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.68f, 30f, 3f, 31.68f, 3f, 33.75f)
            verticalLineToRelative(1.04f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0x00885EDB),
                    1f to Color(0xFFE362F8)
                ),
                start = Offset(16f, 28.3333f),
                end = Offset(22.7485f, 51.75f)
            )
        ) {
            moveTo(3f, 34.79f)
            curveTo(3f, 34.88f, 3.15f, 44f, 16f, 44f)
            reflectiveCurveToRelative(13f, -9.12f, 13f, -9.21f)
            verticalLineToRelative(-1.04f)
            curveToRelative(0f, -2.07f, -1.68f, -3.75f, -3.75f, -3.75f)
            horizontalLineTo(6.75f)
            curveTo(4.68f, 30f, 3f, 31.68f, 3f, 33.75f)
            verticalLineToRelative(1.04f)
            close()
            moveToRelative(13f, -7.29f)
            curveToRelative(-4.14f, 0f, -7.5f, -3.36f, -7.5f, -7.5f)
            curveToRelative(0f, -4.14f, 3.36f, -7.5f, 7.5f, -7.5f)
            curveToRelative(4.14f, 0f, 7.5f, 3.36f, 7.5f, 7.5f)
            curveToRelative(0f, 4.14f, -3.36f, 7.5f, -7.5f, 7.5f)
            close()
            moveTo(30.27f, 25f)
            curveToRelative(-0.24f, 0f, -0.49f, -0.04f, -0.73f, -0.12f)
            curveTo(28.6f, 24.57f, 28f, 23.73f, 28f, 22.75f)
            verticalLineToRelative(-2.81f)
            curveToRelative(-2.26f, -0.36f, -4f, -2.33f, -4f, -4.69f)
            verticalLineToRelative(-6.5f)
            curveTo(24f, 6.13f, 26.13f, 4f, 28.75f, 4f)
            horizontalLineToRelative(11.5f)
            curveTo(42.87f, 4f, 45f, 6.13f, 45f, 8.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 2.62f, -2.13f, 4.75f, -4.75f, 4.75f)
            horizontalLineToRelative(-5.12f)
            lineToRelative(-3.08f, 4.1f)
            curveToRelative(-0.44f, 0.58f, -1.09f, 0.9f, -1.78f, 0.9f)
            close()
        }
    }.build()
}
