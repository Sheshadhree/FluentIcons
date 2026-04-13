package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreHorizontal28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.25f, 14f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveTo(3.75f, 15.243f, 3.75f, 14f)
            reflectiveCurveTo(4.757f, 11.75f, 6f, 11.75f)
            reflectiveCurveTo(8.25f, 12.757f, 8.25f, 14f)
            close()
            moveToRelative(8f, 0f)
            curveToRelative(0f, 1.243f, -1.007f, 2.25f, -2.25f, 2.25f)
            reflectiveCurveToRelative(-2.25f, -1.007f, -2.25f, -2.25f)
            reflectiveCurveToRelative(1.007f, -2.25f, 2.25f, -2.25f)
            reflectiveCurveToRelative(2.25f, 1.007f, 2.25f, 2.25f)
            close()
            moveTo(22f, 16.25f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            reflectiveCurveToRelative(-1.007f, -2.25f, -2.25f, -2.25f)
            reflectiveCurveToRelative(-2.25f, 1.007f, -2.25f, 2.25f)
            reflectiveCurveToRelative(1.007f, 2.25f, 2.25f, 2.25f)
            close()
        }
    }.build()
}
