package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveTo(9.034f, 3f, 10f, 3f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveTo(10.966f, 6.5f, 10f, 6.5f)
            close()
            moveTo(10f, 17f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            reflectiveCurveTo(9.034f, 13.5f, 10f, 13.5f)
            reflectiveCurveToRelative(1.75f, 0.784f, 1.75f, 1.75f)
            reflectiveCurveTo(10.966f, 17f, 10f, 17f)
            close()
            moveToRelative(-1.75f, -7f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            reflectiveCurveToRelative(1.75f, -0.784f, 1.75f, -1.75f)
            reflectiveCurveTo(10.966f, 8.25f, 10f, 8.25f)
            reflectiveCurveTo(8.25f, 9.034f, 8.25f, 10f)
            close()
        }
    }.build()
}
