package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.QuestionCircle24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.QuestionCircle24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 2f)
            curveToRelative(5.523f, 0f, 10f, 4.478f, 10f, 10f)
            reflectiveCurveToRelative(-4.477f, 10f, -10f, 10f)
            reflectiveCurveTo(2f, 17.522f, 2f, 12f)
            reflectiveCurveTo(6.477f, 2f, 12f, 2f)
            close()
            moveToRelative(0f, 1.667f)
            curveToRelative(-4.595f, 0f, -8.333f, 3.738f, -8.333f, 8.333f)
            curveToRelative(0f, 4.595f, 3.738f, 8.333f, 8.333f, 8.333f)
            curveToRelative(4.595f, 0f, 8.333f, -3.738f, 8.333f, -8.333f)
            curveToRelative(0f, -4.595f, -3.738f, -8.333f, -8.333f, -8.333f)
            close()
            moveTo(12f, 15.5f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            reflectiveCurveToRelative(-0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            close()
            moveToRelative(0f, -8.75f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            curveToRelative(0f, 1.01f, -0.297f, 1.574f, -1.051f, 2.359f)
            lineTo(13.53f, 12.03f)
            curveToRelative(-0.622f, 0.622f, -0.78f, 0.886f, -0.78f, 1.47f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            curveToRelative(0f, -1.01f, 0.297f, -1.574f, 1.051f, -2.359f)
            lineToRelative(0.169f, -0.171f)
            curveToRelative(0.622f, -0.622f, 0.78f, -0.886f, 0.78f, -1.47f)
            curveToRelative(0f, -0.69f, -0.56f, -1.25f, -1.25f, -1.25f)
            curveToRelative(-0.647f, 0f, -1.18f, 0.492f, -1.243f, 1.122f)
            lineTo(10.75f, 9.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveTo(9.25f, 9.914f, 9.25f, 9.5f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            close()
        }
    }.build()
}
