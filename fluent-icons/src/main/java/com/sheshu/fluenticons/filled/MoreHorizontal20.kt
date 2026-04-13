package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreHorizontal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.75f, 10f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveTo(3.25f, 10.966f, 3.25f, 10f)
            reflectiveCurveTo(4.034f, 8.25f, 5f, 8.25f)
            reflectiveCurveTo(6.75f, 9.034f, 6.75f, 10f)
            close()
            moveToRelative(5f, 0f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            reflectiveCurveTo(8.25f, 10.966f, 8.25f, 10f)
            reflectiveCurveTo(9.034f, 8.25f, 10f, 8.25f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            close()
            moveTo(15f, 11.75f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(15.966f, 8.25f, 15f, 8.25f)
            reflectiveCurveTo(13.25f, 9.034f, 13.25f, 10f)
            reflectiveCurveToRelative(0.784f, 1.75f, 1.75f, 1.75f)
            close()
        }
    }.build()
}
