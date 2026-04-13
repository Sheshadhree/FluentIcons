package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.TextEditStyle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.TextEditStyle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.676761f to Color(0xFF0078D4),
                    0.84f to Color(0xFF0057AA),
                    1f to Color(0xFF0057AA)
                ),
                start = Offset(2f, 2.4706f),
                end = Offset(4.32388f, 11.1288f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(5f, 2f)
            curveToRelative(0.211f, 0f, 0.4f, 0.133f, 0.471f, 0.332f)
            lineToRelative(2.5f, 7f)
            curveToRelative(0.093f, 0.26f, -0.043f, 0.546f, -0.303f, 0.639f)
            curveToRelative(-0.26f, 0.093f, -0.546f, -0.043f, -0.639f, -0.303f)
            lineTo(5f, 4f)
            lineTo(2.971f, 9.668f)
            curveToRelative(-0.093f, 0.26f, -0.379f, 0.396f, -0.639f, 0.303f)
            curveToRelative(-0.26f, -0.093f, -0.396f, -0.38f, -0.303f, -0.64f)
            lineToRelative(2.5f, -7f)
            curveTo(4.6f, 2.134f, 4.79f, 2f, 5f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    0.676761f to Color(0xFF0078D4),
                    0.84f to Color(0xFF0057AA),
                    1f to Color(0xFF0057AA)
                ),
                start = Offset(2f, 2.4706f),
                end = Offset(4.32388f, 11.1288f)
            ),
            pathFillType = PathFillType.EvenOdd
        ) {
            moveTo(6.5f, 7f)
            horizontalLineToRelative(-3f)
            verticalLineTo(6f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFFA43D),
                    1f to Color(0xFFFB5937)
                ),
                start = Offset(10.0601f, 7.71713f),
                end = Offset(11.1775f, 10.7868f)
            )
        ) {
            moveTo(8.732f, 12.975f)
            lineToRelative(4.597f, -4.596f)
            lineToRelative(-2.707f, -2.707f)
            lineToRelative(-4.597f, 4.596f)
            lineToRelative(-0.011f, 2.718f)
            lineToRelative(2.718f, -0.011f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0.255f to Color(0xFFFFD394),
                    1f to Color(0xFFFF921F)
                ),
                start = Offset(3.90875f, 11.4069f),
                end = Offset(6.98354f, 14.4606f)
            )
        ) {
            moveTo(7.504f, 13.61f)
            curveToRelative(0.484f, -0.098f, 0.929f, -0.335f, 1.278f, -0.684f)
            curveToRelative(0f, 0f, -0.912f, -0.21f, -1.705f, -1.003f)
            curveToRelative(-0.792f, -0.793f, -1.002f, -1.705f, -1.002f, -1.705f)
            curveToRelative(-0.35f, 0.35f, -0.587f, 0.794f, -0.684f, 1.278f)
            lineTo(5.01f, 13.402f)
            curveToRelative(-0.033f, 0.164f, 0.018f, 0.333f, 0.136f, 0.452f)
            curveToRelative(0.119f, 0.118f, 0.288f, 0.17f, 0.452f, 0.136f)
            lineToRelative(1.906f, -0.38f)
            close()
            moveToRelative(5.936f, -8.048f)
            curveToRelative(-0.748f, -0.748f, -1.96f, -0.748f, -2.708f, 0f)
            lineTo(9.61f, 6.681f)
            lineToRelative(2.707f, 2.708f)
            lineToRelative(1.122f, -1.121f)
            curveToRelative(0.748f, -0.748f, 0.748f, -1.96f, 0f, -2.707f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFF921F),
                    1f to Color(0xFFFFE994)
                ),
                start = Offset(11.2417f, 8.48295f),
                end = Offset(8.70432f, 7.37332f)
            )
        ) {
            moveTo(12.091f, 9.616f)
            lineToRelative(0.884f, -0.883f)
            reflectiveCurveToRelative(-0.914f, -0.208f, -1.707f, -1f)
            curveToRelative(-0.793f, -0.794f, -1f, -1.708f, -1f, -1.708f)
            lineTo(9.384f, 6.91f)
            reflectiveCurveToRelative(0.207f, 0.914f, 1f, 1.707f)
            reflectiveCurveToRelative(1.707f, 1f, 1.707f, 1f)
            close()
        }
    }.build()
}
