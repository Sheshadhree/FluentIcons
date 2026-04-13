package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MoreHorizontal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MoreHorizontal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.25f, 8f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(2.75f, 8.69f, 2.75f, 8f)
            reflectiveCurveTo(3.31f, 6.75f, 4f, 6.75f)
            reflectiveCurveTo(5.25f, 7.31f, 5.25f, 8f)
            close()
            moveToRelative(4f, 0f)
            curveToRelative(0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f)
            reflectiveCurveTo(6.75f, 8.69f, 6.75f, 8f)
            reflectiveCurveTo(7.31f, 6.75f, 8f, 6.75f)
            reflectiveCurveTo(9.25f, 7.31f, 9.25f, 8f)
            close()
            moveTo(12f, 9.25f)
            curveToRelative(0.69f, 0f, 1.25f, -0.56f, 1.25f, -1.25f)
            reflectiveCurveTo(12.69f, 6.75f, 12f, 6.75f)
            reflectiveCurveTo(10.75f, 7.31f, 10.75f, 8f)
            reflectiveCurveTo(11.31f, 9.25f, 12f, 9.25f)
            close()
        }
    }.build()
}
