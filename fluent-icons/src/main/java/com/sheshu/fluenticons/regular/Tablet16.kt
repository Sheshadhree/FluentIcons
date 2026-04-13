package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Tablet16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Tablet16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6.5f, 10f)
            curveTo(6.224f, 10f, 6f, 10.224f, 6f, 10.5f)
            reflectiveCurveTo(6.224f, 11f, 6.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(9.776f, 10f, 9.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(2.75f, 3f)
            curveTo(1.784f, 3f, 1f, 3.784f, 1f, 4.75f)
            verticalLineToRelative(6.5f)
            curveTo(1f, 12.216f, 1.784f, 13f, 2.75f, 13f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.966f, 0f, 1.75f, -0.784f, 1.75f, -1.75f)
            verticalLineToRelative(-6.5f)
            curveTo(15f, 3.784f, 14.216f, 3f, 13.25f, 3f)
            horizontalLineTo(2.75f)
            close()
            moveTo(2f, 4.75f)
            curveTo(2f, 4.336f, 2.336f, 4f, 2.75f, 4f)
            horizontalLineToRelative(10.5f)
            curveTo(13.664f, 4f, 14f, 4.336f, 14f, 4.75f)
            verticalLineToRelative(6.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 12f, 2f, 11.664f, 2f, 11.25f)
            verticalLineToRelative(-6.5f)
            close()
        }
    }.build()
}
