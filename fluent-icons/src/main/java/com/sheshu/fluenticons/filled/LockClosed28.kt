package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LockClosed28: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LockClosed28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 6.5f)
            curveTo(9f, 4.015f, 11.015f, 2f, 13.5f, 2f)
            reflectiveCurveTo(18f, 4.015f, 18f, 6.5f)
            verticalLineTo(8f)
            horizontalLineToRelative(1.25f)
            curveTo(21.321f, 8f, 23f, 9.679f, 23f, 11.75f)
            verticalLineToRelative(9.5f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(7.75f)
            curveTo(5.679f, 25f, 4f, 23.321f, 4f, 21.25f)
            verticalLineToRelative(-9.5f)
            curveTo(4f, 9.679f, 5.679f, 8f, 7.75f, 8f)
            horizontalLineTo(9f)
            verticalLineTo(6.5f)
            close()
            moveToRelative(4.5f, -3f)
            curveToRelative(-1.657f, 0f, -3f, 1.343f, -3f, 3f)
            verticalLineTo(8f)
            horizontalLineToRelative(6f)
            verticalLineTo(6.5f)
            curveToRelative(0f, -1.657f, -1.343f, -3f, -3f, -3f)
            close()
            moveToRelative(0f, 14.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            reflectiveCurveTo(14.328f, 15f, 13.5f, 15f)
            reflectiveCurveTo(12f, 15.672f, 12f, 16.5f)
            reflectiveCurveToRelative(0.672f, 1.5f, 1.5f, 1.5f)
            close()
        }
    }.build()
}
