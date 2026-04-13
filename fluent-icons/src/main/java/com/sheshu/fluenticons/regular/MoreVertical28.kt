package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreVertical28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreVertical28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8.25f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            reflectiveCurveTo(12.757f, 3.75f, 14f, 3.75f)
            reflectiveCurveTo(16.25f, 4.757f, 16.25f, 6f)
            reflectiveCurveTo(15.243f, 8.25f, 14f, 8.25f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(-1.243f, 0f, -2.25f, -1.007f, -2.25f, -2.25f)
            reflectiveCurveToRelative(1.007f, -2.25f, 2.25f, -2.25f)
            reflectiveCurveToRelative(2.25f, 1.007f, 2.25f, 2.25f)
            reflectiveCurveToRelative(-1.007f, 2.25f, -2.25f, 2.25f)
            close()
            moveTo(11.75f, 22f)
            curveToRelative(0f, 1.243f, 1.007f, 2.25f, 2.25f, 2.25f)
            reflectiveCurveToRelative(2.25f, -1.007f, 2.25f, -2.25f)
            reflectiveCurveToRelative(-1.007f, -2.25f, -2.25f, -2.25f)
            reflectiveCurveToRelative(-2.25f, 1.007f, -2.25f, 2.25f)
            close()
        }
    }.build()
}
