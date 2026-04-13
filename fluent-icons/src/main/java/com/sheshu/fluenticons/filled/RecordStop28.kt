package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.RecordStop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.RecordStop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 26f)
            curveToRelative(6.627f, 0f, 12f, -5.373f, 12f, -12f)
            reflectiveCurveTo(20.627f, 2f, 14f, 2f)
            reflectiveCurveTo(2f, 7.373f, 2f, 14f)
            reflectiveCurveToRelative(5.373f, 12f, 12f, 12f)
            close()
            moveTo(10.5f, 9f)
            horizontalLineToRelative(7f)
            curveToRelative(0.828f, 0f, 1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(9.672f, 19f, 9f, 18.328f, 9f, 17.5f)
            verticalLineToRelative(-7f)
            curveTo(9f, 9.672f, 9.672f, 9f, 10.5f, 9f)
            close()
        }
    }.build()
}
