package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.QuestionCircle20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.QuestionCircle20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 2f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            close()
            moveToRelative(0f, 1f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(0f, 10.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(10.414f, 15f, 10f, 15f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            reflectiveCurveTo(9.586f, 13.5f, 10f, 13.5f)
            close()
            moveToRelative(0f, -8f)
            curveToRelative(1.38f, 0f, 2.5f, 1.12f, 2.5f, 2.5f)
            curveToRelative(0f, 0.73f, -0.315f, 1.408f, -0.849f, 1.877f)
            lineToRelative(-0.154f, 0.125f)
            lineToRelative(-0.219f, 0.163f)
            lineToRelative(-0.087f, 0.072f)
            curveToRelative(-0.056f, 0.048f, -0.107f, 0.097f, -0.156f, 0.149f)
            curveTo(10.696f, 10.746f, 10.5f, 11.242f, 10.5f, 12f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(9.5f, 12.276f, 9.5f, 12f)
            curveToRelative(0f, -1.012f, 0.293f, -1.752f, 0.805f, -2.298f)
            curveToRelative(0.111f, -0.119f, 0.227f, -0.222f, 0.356f, -0.323f)
            lineToRelative(0.247f, -0.185f)
            lineToRelative(0.118f, -0.1f)
            curveTo(11.325f, 8.815f, 11.5f, 8.423f, 11.5f, 8f)
            curveToRelative(0f, -0.828f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(8.5f, 7.172f, 8.5f, 8f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            reflectiveCurveTo(7.5f, 8.276f, 7.5f, 8f)
            curveToRelative(0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f)
            close()
        }
    }.build()
}
