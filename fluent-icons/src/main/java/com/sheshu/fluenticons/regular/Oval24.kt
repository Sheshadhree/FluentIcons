package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Oval24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Oval24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 12f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            horizontalLineToRelative(4f)
            curveToRelative(4.418f, 0f, 8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            horizontalLineToRelative(-4f)
            curveToRelative(-4.418f, 0f, -8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -6.5f)
            curveToRelative(-3.59f, 0f, -6.5f, 2.91f, -6.5f, 6.5f)
            reflectiveCurveToRelative(2.91f, 6.5f, 6.5f, 6.5f)
            horizontalLineToRelative(4f)
            curveToRelative(3.59f, 0f, 6.5f, -2.91f, 6.5f, -6.5f)
            reflectiveCurveTo(17.59f, 5.5f, 14f, 5.5f)
            horizontalLineToRelative(-4f)
            close()
        }
    }.build()
}
