package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignBottom16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignBottom16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1.5f, 14f)
            curveTo(1.224f, 14f, 1f, 13.776f, 1f, 13.5f)
            reflectiveCurveTo(1.224f, 13f, 1.5f, 13f)
            horizontalLineToRelative(13f)
            curveToRelative(0.276f, 0f, 0.5f, 0.224f, 0.5f, 0.5f)
            reflectiveCurveTo(14.776f, 14f, 14.5f, 14f)
            horizontalLineToRelative(-13f)
            close()
            moveTo(2f, 10.25f)
            curveTo(2f, 11.216f, 2.784f, 12f, 3.75f, 12f)
            horizontalLineToRelative(1.5f)
            curveTo(6.216f, 12f, 7f, 11.216f, 7f, 10.25f)
            verticalLineToRelative(-6.5f)
            curveTo(7f, 2.784f, 6.216f, 2f, 5.25f, 2f)
            horizontalLineToRelative(-1.5f)
            curveTo(2.784f, 2f, 2f, 2.784f, 2f, 3.75f)
            verticalLineToRelative(6.5f)
            close()
            moveToRelative(7f, 0f)
            curveTo(9f, 11.216f, 9.784f, 12f, 10.75f, 12f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-4.5f)
            curveTo(14f, 4.784f, 13.216f, 4f, 12.25f, 4f)
            horizontalLineToRelative(-1.5f)
            curveTo(9.784f, 4f, 9f, 4.784f, 9f, 5.75f)
            verticalLineToRelative(4.5f)
            close()
        }
    }.build()
}
