package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonMail24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonMail24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 15.5f)
            curveToRelative(0f, -0.563f, 0.186f, -1.082f, 0.5f, -1.5f)
            horizontalLineTo(5.253f)
            curveToRelative(-1.242f, 0f, -2.25f, 1.007f, -2.25f, 2.25f)
            verticalLineToRelative(0.919f)
            curveToRelative(0f, 0.572f, 0.18f, 1.13f, 0.511f, 1.596f)
            curveTo(5.056f, 20.929f, 7.58f, 22f, 11f, 22f)
            horizontalLineToRelative(0.05f)
            curveTo(11.018f, 21.838f, 11f, 21.67f, 11f, 21.5f)
            verticalLineToRelative(-6f)
            close()
            moveToRelative(0f, -13.495f)
            curveToRelative(2.762f, 0f, 5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.238f, 5f, -5f, 5f)
            curveToRelative(-2.761f, 0f, -5f, -2.239f, -5f, -5f)
            reflectiveCurveToRelative(2.239f, -5f, 5f, -5f)
            close()
            moveToRelative(6.51f, 16.922f)
            lineToRelative(-5.49f, -3.203f)
            curveTo(12.153f, 14.75f, 12.99f, 14f, 14f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(1.095f, 0f, 1.985f, 0.88f, 2f, 1.97f)
            lineToRelative(-5.49f, 2.957f)
            close()
            moveToRelative(0.227f, 1.014f)
            lineToRelative(5.264f, -2.834f)
            verticalLineTo(21f)
            curveToRelative(0f, 1.105f, -0.896f, 2f, -2f, 2f)
            horizontalLineToRelative(-7f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            verticalLineToRelative(-4.13f)
            lineToRelative(5.248f, 3.062f)
            curveToRelative(0.15f, 0.088f, 0.335f, 0.091f, 0.489f, 0.009f)
            close()
        }
    }.build()
}
