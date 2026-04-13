package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Desk28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Desk28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.754f, 4f)
            curveToRelative(-1.519f, 0f, -2.75f, 1.231f, -2.75f, 2.75f)
            verticalLineTo(9f)
            horizontalLineTo(24.5f)
            verticalLineToRelative(14.25f)
            curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
            curveToRelative(0.414f, 0f, 0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineTo(6.75f)
            curveTo(26f, 5.231f, 24.768f, 4f, 23.25f, 4f)
            horizontalLineTo(4.753f)
            close()
            moveTo(14f, 10.5f)
            horizontalLineTo(2.004f)
            verticalLineToRelative(9.75f)
            curveToRelative(0f, 2.071f, 1.679f, 3.75f, 3.75f, 3.75f)
            horizontalLineToRelative(4.496f)
            curveToRelative(2.071f, 0f, 3.75f, -1.679f, 3.75f, -3.75f)
            verticalLineTo(10.5f)
            close()
            moveToRelative(-8.5f, 4.25f)
            curveTo(5.5f, 14.336f, 5.836f, 14f, 6.25f, 14f)
            horizontalLineToRelative(3.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveToRelative(-0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-3.5f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
