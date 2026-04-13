package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreHorizontal28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.75f, 14f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            reflectiveCurveTo(3.25f, 15.519f, 3.25f, 14f)
            reflectiveCurveTo(4.481f, 11.25f, 6f, 11.25f)
            reflectiveCurveTo(8.75f, 12.481f, 8.75f, 14f)
            close()
            moveToRelative(8f, 0f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            reflectiveCurveToRelative(-2.75f, -1.231f, -2.75f, -2.75f)
            reflectiveCurveToRelative(1.231f, -2.75f, 2.75f, -2.75f)
            reflectiveCurveToRelative(2.75f, 1.231f, 2.75f, 2.75f)
            close()
            moveTo(22f, 16.75f)
            curveToRelative(1.519f, 0f, 2.75f, -1.231f, 2.75f, -2.75f)
            reflectiveCurveToRelative(-1.231f, -2.75f, -2.75f, -2.75f)
            reflectiveCurveToRelative(-2.75f, 1.231f, -2.75f, 2.75f)
            reflectiveCurveToRelative(1.231f, 2.75f, 2.75f, 2.75f)
            close()
        }
    }.build()
}
