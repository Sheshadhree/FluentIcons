package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreVertical24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreVertical24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12f, 7.75f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveTo(11.034f, 4.25f, 12f, 4.25f)
            reflectiveCurveTo(13.75f, 5.034f, 13.75f, 6f)
            reflectiveCurveTo(12.966f, 7.75f, 12f, 7.75f)
            close()
            moveToRelative(0f, 6f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveToRelative(0.784f, -1.75f, 1.75f, -1.75f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveToRelative(-0.784f, 1.75f, -1.75f, 1.75f)
            close()
            moveTo(10.25f, 18f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveToRelative(-0.784f, -1.75f, -1.75f, -1.75f)
            reflectiveCurveToRelative(-1.75f, 0.784f, -1.75f, 1.75f)
            close()
        }
    }.build()
}
