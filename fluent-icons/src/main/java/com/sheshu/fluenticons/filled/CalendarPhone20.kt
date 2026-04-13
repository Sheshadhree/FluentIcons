package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CalendarPhone20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CalendarPhone20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(17f, 7f)
            verticalLineToRelative(1.05f)
            curveTo(16.838f, 8.017f, 16.671f, 8f, 16.5f, 8f)
            horizontalLineToRelative(-3f)
            curveTo(12.12f, 8f, 11f, 9.12f, 11f, 10.5f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 0.171f, 0.017f, 0.338f, 0.05f, 0.5f)
            horizontalLineTo(5.5f)
            curveTo(4.12f, 17f, 3f, 15.88f, 3f, 14.5f)
            verticalLineTo(7f)
            horizontalLineToRelative(14f)
            close()
            moveToRelative(-2.5f, -4f)
            curveTo(15.88f, 3f, 17f, 4.12f, 17f, 5.5f)
            verticalLineTo(6f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            curveTo(3f, 4.12f, 4.12f, 3f, 5.5f, 3f)
            horizontalLineToRelative(9f)
            close()
            moveToRelative(-0.75f, 6f)
            curveTo(12.784f, 9f, 12f, 9.784f, 12f, 10.75f)
            verticalLineToRelative(5.5f)
            curveToRelative(0f, 0.966f, 0.784f, 1.75f, 1.75f, 1.75f)
            horizontalLineToRelative(2.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-5.5f)
            curveTo(18f, 9.784f, 17.216f, 9f, 16.25f, 9f)
            horizontalLineToRelative(-2.5f)
            close()
            moveTo(14f, 15.5f)
            curveToRelative(0f, -0.276f, 0.224f, -0.5f, 0.5f, -0.5f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(15.776f, 16f, 15.5f, 16f)
            horizontalLineToRelative(-1f)
            curveToRelative(-0.276f, 0f, -0.5f, -0.224f, -0.5f, -0.5f)
            close()
        }
    }.build()
}
