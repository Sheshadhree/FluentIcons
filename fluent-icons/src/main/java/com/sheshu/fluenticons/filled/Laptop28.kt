package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Laptop28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Laptop28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.004f, 7.75f)
            curveTo(4.004f, 6.231f, 5.235f, 5f, 6.754f, 5f)
            horizontalLineToRelative(14.5f)
            curveToRelative(1.519f, 0f, 2.75f, 1.231f, 2.75f, 2.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-14.5f)
            curveToRelative(-1.519f, 0f, -2.75f, -1.231f, -2.75f, -2.75f)
            verticalLineToRelative(-8.5f)
            close()
            moveToRelative(-2f, 13.5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineTo(25.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            reflectiveCurveTo(25.665f, 22f, 25.25f, 22f)
            horizontalLineTo(2.753f)
            curveToRelative(-0.414f, 0f, -0.75f, -0.336f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
