package com.sheshu.fluenticons.color

import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Color.QuestionCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Color.QuestionCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFF0FAFFF),
                    1f to Color(0xFF2764E7)
                ),
                start = Offset(2f, 2f),
                end = Offset(22f, 22f)
            )
        ) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.478f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.522f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
        }
        path(
            fill = Brush.linearGradient(
                colorStops = arrayOf(
                    0f to Color(0xFFFDFDFD),
                    1f to Color(0xFFCCEAFF)
                ),
                start = Offset(9.73109f, 6.93875f),
                end = Offset(13.0074f, 17.7443f)
            )
        ) {
            moveTo(12f, 15.5f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(0f, -8.75f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.38f, 0f, 0.694f, -0.282f, 0.743f, -0.648f)
            lineTo(10.75f, 9.5f)
            curveToRelative(0f, -0.69f, 0.56f, -1.25f, 1.25f, -1.25f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            curveToRelative(0f, 0.539f, -0.135f, 0.805f, -0.645f, 1.332f)
            lineTo(12.47f, 10.97f)
            curveToRelative(-0.878f, 0.878f, -1.22f, 1.447f, -1.22f, 2.53f)
            curveToRelative(0f, 0.414f, 0.336f, 0.75f, 0.75f, 0.75f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            curveToRelative(0f, -0.539f, 0.135f, -0.805f, 0.645f, -1.332f)
            lineToRelative(0.135f, -0.138f)
            curveToRelative(0.878f, -0.878f, 1.22f, -1.447f, 1.22f, -2.53f)
            curveToRelative(0f, -1.519f, -1.231f, -2.75f, -2.75f, -2.75f)
            close()
        }
    }.build()
}
