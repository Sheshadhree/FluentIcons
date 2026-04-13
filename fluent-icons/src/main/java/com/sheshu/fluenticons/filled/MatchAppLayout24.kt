package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.MatchAppLayout24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.MatchAppLayout24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.5f, 8f)
            curveToRelative(0.966f, 0f, 1.75f, 0.784f, 1.75f, 1.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(3.75f)
            curveTo(2.784f, 16f, 2f, 15.216f, 2f, 14.25f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.918f, 0.707f, -1.671f, 1.607f, -1.744f)
            lineTo(3.75f, 8f)
            horizontalLineTo(9.5f)
            close()
            moveToRelative(10.75f, 0f)
            curveTo(21.216f, 8f, 22f, 8.784f, 22f, 9.75f)
            verticalLineToRelative(4.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(14.5f)
            curveToRelative(-0.966f, 0f, -1.75f, -0.784f, -1.75f, -1.75f)
            verticalLineToRelative(-4.5f)
            curveTo(12.75f, 8.784f, 13.534f, 8f, 14.5f, 8f)
            horizontalLineToRelative(5.75f)
            close()
        }
    }.build()
}
