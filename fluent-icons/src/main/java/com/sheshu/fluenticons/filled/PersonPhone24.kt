package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonPhone24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonPhone24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 21.372f)
            verticalLineTo(14f)
            horizontalLineTo(4.253f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.249f)
            verticalLineToRelative(0.92f)
            curveToRelative(0f, 0.572f, 0.18f, 1.13f, 0.511f, 1.596f)
            curveTo(4.056f, 20.929f, 6.58f, 22f, 10f, 22f)
            curveToRelative(1.51f, 0f, 2.847f, -0.209f, 4f, -0.629f)
            close()
            moveTo(10f, 2.005f)
            curveToRelative(2.762f, 0f, 5f, 2.238f, 5f, 5f)
            curveToRelative(0f, 2.761f, -2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            curveToRelative(0f, -2.762f, 2.239f, -5f, 5f, -5f)
            close()
            moveTo(21.255f, 10f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 0.967f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(16.75f)
            curveTo(15.784f, 23f, 15f, 22.217f, 15f, 21.25f)
            verticalLineToRelative(-9.5f)
            curveToRelative(0f, -0.966f, 0.784f, -1.75f, 1.75f, -1.75f)
            horizontalLineToRelative(4.505f)
            close()
            moveToRelative(-2.002f, 8.997f)
            horizontalLineToRelative(-0.5f)
            lineToRelative(-0.102f, 0.007f)
            curveToRelative(-0.366f, 0.05f, -0.648f, 0.363f, -0.648f, 0.743f)
            curveToRelative(0f, 0.414f, 0.335f, 0.75f, 0.75f, 0.75f)
            horizontalLineToRelative(0.5f)
            lineToRelative(0.101f, -0.007f)
            curveToRelative(0.366f, -0.05f, 0.649f, -0.363f, 0.649f, -0.743f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            close()
        }
    }.build()
}
