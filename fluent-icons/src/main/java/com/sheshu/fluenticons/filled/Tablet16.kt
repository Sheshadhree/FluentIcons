package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Tablet16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Tablet16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 4.75f)
            curveTo(1f, 3.784f, 1.784f, 3f, 2.75f, 3f)
            horizontalLineToRelative(10.5f)
            curveTo(14.216f, 3f, 15f, 3.784f, 15f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.966f, -0.784f, 1.75f, -1.75f, 1.75f)
            horizontalLineTo(2.75f)
            curveTo(1.784f, 13f, 1f, 12.216f, 1f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
            moveTo(6.5f, 10f)
            curveTo(6.224f, 10f, 6f, 10.224f, 6f, 10.5f)
            reflectiveCurveTo(6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.776f, 10f, 9.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
        }
    }.build()
}
