package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreHorizontal24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreHorizontal24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.75f, 12f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveTo(4.25f, 12.966f, 4.25f, 12f)
            reflectiveCurveTo(5.034f, 10.25f, 6f, 10.25f)
            reflectiveCurveTo(7.75f, 11.034f, 7.75f, 12f)
            close()
            moveToRelative(6f, 0f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveToRelative(-1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveToRelative(0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            close()
            moveTo(18f, 13.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveToRelative(-0.784f, -1.75f, -1.75f, -1.75f)
            reflectiveCurveToRelative(-1.75f, 0.784f, -1.75f, 1.75f)
            reflectiveCurveToRelative(0.784f, 1.75f, 1.75f, 1.75f)
            close()
        }
    }.build()
}
