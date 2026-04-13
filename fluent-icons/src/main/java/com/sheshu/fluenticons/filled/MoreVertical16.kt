package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 5.25f)
            curveTo(7.31f, 5.25f, 6.75f, 4.69f, 6.75f, 4f)
            reflectiveCurveTo(7.31f, 2.75f, 8f, 2.75f)
            reflectiveCurveTo(9.25f, 3.31f, 9.25f, 4f)
            reflectiveCurveTo(8.69f, 5.25f, 8f, 5.25f)
            close()
            moveToRelative(0f, 4f)
            curveTo(7.31f, 9.25f, 6.75f, 8.69f, 6.75f, 8f)
            reflectiveCurveTo(7.31f, 6.75f, 8f, 6.75f)
            reflectiveCurveTo(9.25f, 7.31f, 9.25f, 8f)
            reflectiveCurveTo(8.69f, 9.25f, 8f, 9.25f)
            close()
            moveTo(6.75f, 12f)
            curveToRelative(0f, 0.69f, 0.56f, 1.25f, 1.25f, 1.25f)
            reflectiveCurveTo(9.25f, 12.69f, 9.25f, 12f)
            reflectiveCurveTo(8.69f, 10.75f, 8f, 10.75f)
            reflectiveCurveTo(6.75f, 11.31f, 6.75f, 12f)
            close()
        }
    }.build()
}
