package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MoreHorizontal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MoreHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.25f, 10f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(3.75f, 10.69f, 3.75f, 10f)
            reflectiveCurveTo(4.31f, 8.75f, 5f, 8.75f)
            reflectiveCurveTo(6.25f, 9.31f, 6.25f, 10f)
            close()
            moveToRelative(5f, 0f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(8.75f, 10.69f, 8.75f, 10f)
            reflectiveCurveTo(9.31f, 8.75f, 10f, 8.75f)
            reflectiveCurveToRelative(1.25f, 0.56f, 1.25f, 1.25f)
            close()
            moveTo(15f, 11.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(15.69f, 8.75f, 15f, 8.75f)
            reflectiveCurveTo(13.75f, 9.31f, 13.75f, 10f)
            reflectiveCurveToRelative(0.56f, 1.25f, 1.25f, 1.25f)
            close()
        }
    }.build()
}
