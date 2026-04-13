package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BookContacts28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BookContacts28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 5.75f)
            curveTo(5f, 3.679f, 6.679f, 2f, 8.75f, 2f)
            horizontalLineToRelative(10.5f)
            curveTo(21.321f, 2f, 23f, 3.679f, 23f, 5.75f)
            verticalLineTo(21f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineTo(6.514f)
            curveToRelative(0.124f, 1.125f, 1.078f, 2f, 2.236f, 2f)
            horizontalLineToRelative(13.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.335f, 0.75f, 0.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(8.75f)
            curveTo(6.679f, 26f, 5f, 24.32f, 5f, 22.25f)
            verticalLineTo(5.75f)
            close()
            moveTo(16.5f, 9.5f)
            curveTo(16.5f, 8.12f, 15.38f, 7f, 14f, 7f)
            reflectiveCurveToRelative(-2.5f, 1.12f, -2.5f, 2.5f)
            reflectiveCurveTo(12.62f, 12f, 14f, 12f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            close()
            moveToRelative(2f, 5.375f)
            verticalLineToRelative(-0.103f)
            curveToRelative(0f, -0.979f, -0.794f, -1.772f, -1.773f, -1.772f)
            horizontalLineToRelative(-5.454f)
            curveToRelative(-0.98f, 0f, -1.773f, 0.793f, -1.773f, 1.772f)
            verticalLineToRelative(0.103f)
            curveTo(9.5f, 16.437f, 10.786f, 18f, 14f, 18f)
            reflectiveCurveToRelative(4.5f, -1.569f, 4.5f, -3.125f)
            close()
        }
    }.build()
}
