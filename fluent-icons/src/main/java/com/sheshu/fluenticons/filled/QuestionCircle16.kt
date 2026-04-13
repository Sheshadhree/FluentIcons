package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.QuestionCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.QuestionCircle16",
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
            moveToRelative(0f, 10f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            reflectiveCurveTo(7.586f, 12.5f, 8f, 12.5f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            reflectiveCurveTo(8.414f, 11f, 8f, 11f)
            close()
            moveToRelative(0f, -7f)
            curveTo(6.895f, 4f, 6f, 4.895f, 6f, 6f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveTo(7f, 6.276f, 7f, 6f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            curveToRelative(0f, 0.255f, -0.063f, 0.4f, -0.143f, 0.515f)
            curveToRelative(-0.104f, 0.147f, -0.231f, 0.25f, -0.454f, 0.464f)
            curveToRelative(-0.205f, 0.197f, -0.441f, 0.45f, -0.62f, 0.826f)
            curveTo(7.605f, 8.18f, 7.5f, 8.644f, 7.5f, 9.25f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            curveToRelative(0f, -0.489f, 0.083f, -0.8f, 0.185f, -1.017f)
            curveToRelative(0.103f, -0.216f, 0.242f, -0.37f, 0.412f, -0.534f)
            curveToRelative(0.152f, -0.147f, 0.4f, -0.357f, 0.578f, -0.61f)
            curveTo(9.875f, 6.803f, 10f, 6.458f, 10f, 6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
