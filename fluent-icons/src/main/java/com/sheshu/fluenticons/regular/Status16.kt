package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Status16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Status16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.354f, 1.647f)
            curveToRelative(-0.886f, -0.886f, -2.322f, -0.886f, -3.207f, 0f)
            lineToRelative(-4.25f, 4.25f)
            curveTo(6.841f, 5.95f, 6.8f, 6.018f, 6.775f, 6.092f)
            lineToRelative(-1.25f, 3.75f)
            curveToRelative(-0.06f, 0.18f, -0.013f, 0.378f, 0.12f, 0.512f)
            curveToRelative(0.134f, 0.134f, 0.333f, 0.18f, 0.512f, 0.12f)
            lineToRelative(3.75f, -1.25f)
            curveToRelative(0.074f, -0.024f, 0.14f, -0.065f, 0.196f, -0.12f)
            lineToRelative(4.25f, -4.25f)
            curveToRelative(0.885f, -0.886f, 0.885f, -2.322f, 0f, -3.207f)
            close()
            moveToRelative(-2.5f, 0.707f)
            curveToRelative(0.495f, -0.495f, 1.297f, -0.495f, 1.793f, 0f)
            curveToRelative(0.495f, 0.495f, 0.495f, 1.297f, 0f, 1.793f)
            lineTo(9.48f, 8.313f)
            lineTo(6.79f, 9.21f)
            lineToRelative(0.897f, -2.69f)
            lineToRelative(4.167f, -4.166f)
            close()
            moveTo(8f, 3f)
            curveToRelative(0.123f, 0f, 0.245f, 0.005f, 0.366f, 0.013f)
            lineTo(9.248f, 2.13f)
            curveTo(8.846f, 2.045f, 8.429f, 2f, 8f, 2f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            curveToRelative(0f, -0.428f, -0.045f, -0.846f, -0.13f, -1.248f)
            lineToRelative(-0.883f, 0.883f)
            curveTo(12.996f, 7.755f, 13f, 7.877f, 13f, 8f)
            curveToRelative(0f, 2.762f, -2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.238f, -5f, -5f)
            curveToRelative(0f, -2.76f, 2.239f, -5f, 5f, -5f)
            close()
        }
    }.build()
}
