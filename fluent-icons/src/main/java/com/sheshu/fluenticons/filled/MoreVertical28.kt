package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreVertical28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreVertical28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8.75f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            reflectiveCurveTo(12.481f, 3.25f, 14f, 3.25f)
            reflectiveCurveTo(16.75f, 4.481f, 16.75f, 6f)
            reflectiveCurveTo(15.519f, 8.75f, 14f, 8.75f)
            close()
            moveToRelative(0f, 8f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            reflectiveCurveToRelative(1.231f, -2.75f, 2.75f, -2.75f)
            reflectiveCurveToRelative(2.75f, 1.231f, 2.75f, 2.75f)
            reflectiveCurveToRelative(-1.231f, 2.75f, -2.75f, 2.75f)
            close()
            moveTo(11.25f, 22f)
            curveToRelative(0f, 1.519f, 1.231f, 2.75f, 2.75f, 2.75f)
            reflectiveCurveToRelative(2.75f, -1.231f, 2.75f, -2.75f)
            reflectiveCurveToRelative(-1.231f, -2.75f, -2.75f, -2.75f)
            reflectiveCurveToRelative(-2.75f, 1.231f, -2.75f, 2.75f)
            close()
        }
    }.build()
}
