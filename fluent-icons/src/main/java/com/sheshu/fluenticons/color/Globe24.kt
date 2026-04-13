package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.Globe24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.Globe24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF29C3FF),
                    1f to Color(0xFF2052CB)
                ),
                start = Offset(6.44444f, 5.33333f),
                end = Offset(20.8889f, 18.6667f)
            )
        ) {
            moveTo(12f, 22f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            reflectiveCurveTo(17.523f, 2f, 12f, 2f)
            reflectiveCurveTo(2f, 6.477f, 2f, 12f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            close()
        }
        path(
            fill = Brush.radialGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF25A2F0),
                    0.97403f to Color(0xFF3BD5FF)
                ),
                center = Offset(18.3245f, 17.003f),
                radius = 16.0089f
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(9.115f, 2.422f)
            curveToRelative(-0.32f, 0.499f, -0.604f, 1.074f, -0.85f, 1.704f)
            curveToRelative(-0.48f, 1.23f, -0.838f, 2.723f, -1.049f, 4.374f)
            horizontalLineTo(2.63f)
            curveTo(2.45f, 8.983f, 2.305f, 9.485f, 2.2f, 10f)
            horizontalLineToRelative(4.87f)
            curveTo(7.024f, 10.65f, 7f, 11.319f, 7f, 12f)
            curveToRelative(0f, 1.035f, 0.054f, 2.042f, 0.157f, 3f)
            horizontalLineTo(2.458f)
            curveToRelative(0.163f, 0.52f, 0.368f, 1.02f, 0.61f, 1.5f)
            horizontalLineToRelative(4.297f)
            curveToRelative(0.215f, 1.255f, 0.52f, 2.397f, 0.9f, 3.374f)
            curveToRelative(0.246f, 0.63f, 0.53f, 1.205f, 0.85f, 1.704f)
            curveTo(10.03f, 21.852f, 10.997f, 22f, 12f, 22f)
            reflectiveCurveToRelative(1.972f, -0.148f, 2.885f, -0.422f)
            curveToRelative(0.321f, -0.499f, 0.604f, -1.074f, 0.85f, -1.704f)
            curveToRelative(0.38f, -0.977f, 0.685f, -2.119f, 0.9f, -3.374f)
            horizontalLineToRelative(4.298f)
            curveToRelative(0.242f, -0.48f, 0.446f, -0.98f, 0.61f, -1.5f)
            horizontalLineToRelative(-4.7f)
            curveTo(16.946f, 14.042f, 17f, 13.035f, 17f, 12f)
            curveToRelative(0f, -0.681f, -0.023f, -1.35f, -0.069f, -2f)
            horizontalLineToRelative(4.87f)
            curveToRelative(-0.105f, -0.515f, -0.25f, -1.017f, -0.43f, -1.5f)
            horizontalLineToRelative(-4.587f)
            curveToRelative(-0.21f, -1.651f, -0.57f, -3.144f, -1.05f, -4.374f)
            curveToRelative(-0.245f, -0.63f, -0.528f, -1.205f, -0.849f, -1.704f)
            curveTo(13.972f, 2.148f, 13.003f, 2f, 12f, 2f)
            reflectiveCurveToRelative(-1.97f, 0.148f, -2.885f, 0.422f)
            close()
            moveTo(8.73f, 8.5f)
            curveToRelative(0.2f, -1.47f, 0.523f, -2.774f, 0.934f, -3.829f)
            curveToRelative(0.36f, -0.92f, 0.77f, -1.612f, 1.194f, -2.062f)
            curveTo(11.277f, 2.163f, 11.662f, 2f, 12f, 2f)
            curveToRelative(0.338f, 0f, 0.723f, 0.163f, 1.143f, 0.609f)
            curveToRelative(0.423f, 0.45f, 0.835f, 1.142f, 1.194f, 2.062f)
            curveToRelative(0.412f, 1.055f, 0.734f, 2.36f, 0.934f, 3.829f)
            horizontalLineTo(8.73f)
            close()
            moveTo(12f, 22f)
            curveToRelative(0.338f, 0f, 0.723f, -0.163f, 1.143f, -0.609f)
            curveToRelative(0.423f, -0.45f, 0.835f, -1.142f, 1.194f, -2.062f)
            curveToRelative(0.316f, -0.81f, 0.58f, -1.765f, 0.775f, -2.829f)
            horizontalLineTo(8.888f)
            curveToRelative(0.196f, 1.064f, 0.46f, 2.02f, 0.775f, 2.829f)
            curveToRelative(0.36f, 0.92f, 0.77f, 1.612f, 1.194f, 2.062f)
            curveTo(11.277f, 21.837f, 11.662f, 22f, 12f, 22f)
            close()
            moveTo(8.5f, 12f)
            curveToRelative(0f, 1.048f, 0.058f, 2.055f, 0.166f, 3f)
            horizontalLineToRelative(6.668f)
            curveToRelative(0.108f, -0.945f, 0.166f, -1.952f, 0.166f, -3f)
            curveToRelative(0f, -0.686f, -0.025f, -1.355f, -0.072f, -2f)
            horizontalLineTo(8.573f)
            curveTo(8.525f, 10.645f, 8.5f, 11.314f, 8.5f, 12f)
            close()
        }
    }.build()
}
