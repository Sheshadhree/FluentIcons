package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarWeekStart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarWeekStart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 3f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineToRelative(-9f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(-8f, 3f)
            curveTo(6.255f, 6f, 6.05f, 6.177f, 6.008f, 6.41f)
            lineTo(6f, 6.5f)
            verticalLineToRelative(7f)
            lineToRelative(0.008f, 0.09f)
            curveTo(6.05f, 13.823f, 6.255f, 14f, 6.5f, 14f)
            reflectiveCurveToRelative(0.45f, -0.177f, 0.492f, -0.41f)
            lineTo(7f, 13.5f)
            verticalLineToRelative(-7f)
            lineTo(6.992f, 6.41f)
            curveTo(6.95f, 6.177f, 6.745f, 6f, 6.5f, 6f)
            close()
        }
    }.build()
}
