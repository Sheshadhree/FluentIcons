package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.ToggleRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.ToggleRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(38.5f, 24f)
            curveToRelative(0f, -2.761f, -2.239f, -5f, -5f, -5f)
            reflectiveCurveToRelative(-5f, 2.239f, -5f, 5f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            close()
            moveToRelative(5.5f, 0f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            horizontalLineTo(14f)
            curveTo(8.477f, 14f, 4f, 18.477f, 4f, 24f)
            reflectiveCurveToRelative(4.477f, 10f, 10f, 10f)
            horizontalLineToRelative(20f)
            curveToRelative(5.523f, 0f, 10f, -4.477f, 10f, -10f)
            close()
            moveToRelative(-10f, -7.5f)
            curveToRelative(4.142f, 0f, 7.5f, 3.358f, 7.5f, 7.5f)
            curveToRelative(0f, 4.142f, -3.358f, 7.5f, -7.5f, 7.5f)
            horizontalLineTo(14f)
            curveToRelative(-4.142f, 0f, -7.5f, -3.358f, -7.5f, -7.5f)
            curveToRelative(0f, -4.142f, 3.358f, -7.5f, 7.5f, -7.5f)
            horizontalLineToRelative(20f)
            close()
        }
    }.build()
}
