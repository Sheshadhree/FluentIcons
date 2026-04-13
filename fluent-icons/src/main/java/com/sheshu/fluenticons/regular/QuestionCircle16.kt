package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.QuestionCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.QuestionCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 1f)
            curveToRelative(3.866f, 0f, 7f, 3.134f, 7f, 7f)
            reflectiveCurveToRelative(-3.134f, 7f, -7f, 7f)
            reflectiveCurveToRelative(-7f, -3.134f, -7f, -7f)
            reflectiveCurveToRelative(3.134f, -7f, 7f, -7f)
            close()
            moveToRelative(0f, 1f)
            curveTo(4.686f, 2f, 2f, 4.686f, 2f, 8f)
            reflectiveCurveToRelative(2.686f, 6f, 6f, 6f)
            reflectiveCurveToRelative(6f, -2.686f, 6f, -6f)
            reflectiveCurveToRelative(-2.686f, -6f, -6f, -6f)
            close()
            moveToRelative(0f, 8.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(8.414f, 12f, 8f, 12f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(7.586f, 10.5f, 8f, 10.5f)
            close()
            moveTo(8f, 4f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            curveToRelative(0f, 0.458f, -0.125f, 0.803f, -0.325f, 1.089f)
            curveToRelative(-0.178f, 0.253f, -0.426f, 0.463f, -0.578f, 0.61f)
            curveToRelative(-0.17f, 0.164f, -0.309f, 0.318f, -0.412f, 0.534f)
            curveTo(8.583f, 8.45f, 8.5f, 8.761f, 8.5f, 9.25f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveToRelative(-0.5f, -0.224f, -0.5f, -0.5f)
            curveToRelative(0f, -0.606f, 0.105f, -1.07f, 0.283f, -1.445f)
            curveToRelative(0.179f, -0.376f, 0.415f, -0.63f, 0.62f, -0.826f)
            curveToRelative(0.223f, -0.214f, 0.35f, -0.317f, 0.454f, -0.464f)
            curveTo(8.937f, 6.399f, 9f, 6.255f, 9f, 6f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            reflectiveCurveTo(7f, 5.448f, 7f, 6f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(6f, 6.276f, 6f, 6f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            close()
        }
    }.build()
}
