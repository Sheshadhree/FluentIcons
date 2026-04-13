package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreVertical20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreVertical20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 6f)
            curveTo(9.31f, 6f, 8.75f, 5.44f, 8.75f, 4.75f)
            reflectiveCurveTo(9.31f, 3.5f, 10f, 3.5f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveTo(10.69f, 6f, 10f, 6f)
            close()
            moveToRelative(0f, 5.25f)
            curveToRelative(-0.69f, 0f, -1.25f, -0.56f, -1.25f, -1.25f)
            reflectiveCurveTo(9.31f, 8.75f, 10f, 8.75f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            reflectiveCurveToRelative(-0.56f, 1.25f, -1.25f, 1.25f)
            close()
            moveToRelative(-1.25f, 4f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveToRelative(1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(10.69f, 14f, 10f, 14f)
            reflectiveCurveToRelative(-1.25f, 0.56f, -1.25f, 1.25f)
            close()
        }
    }.build()
}
