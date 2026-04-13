package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Archive20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Archive20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8.5f, 10f)
            curveTo(8.224f, 10f, 8f, 10.224f, 8f, 10.5f)
            reflectiveCurveTo(8.224f, 11f, 8.5f, 11f)
            horizontalLineToRelative(3f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(11.776f, 10f, 11.5f, 10f)
            horizontalLineToRelative(-3f)
            close()
            moveTo(2f, 4.75f)
            curveTo(2f, 3.784f, 2.784f, 3f, 3.75f, 3f)
            horizontalLineToRelative(12.5f)
            curveTo(17.216f, 3f, 18f, 3.784f, 18f, 4.75f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.698f, -0.409f, 1.3f, -1f, 1.582f)
            verticalLineTo(14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(6f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineTo(7.832f)
            curveTo(2.409f, 7.55f, 2f, 6.948f, 2f, 6.25f)
            verticalLineToRelative(-1.5f)
            close()
            moveTo(3.75f, 4f)
            curveTo(3.336f, 4f, 3f, 4.336f, 3f, 4.75f)
            verticalLineToRelative(1.5f)
            curveTo(3f, 6.664f, 3.336f, 7f, 3.75f, 7f)
            horizontalLineToRelative(12.5f)
            curveTo(16.664f, 7f, 17f, 6.664f, 17f, 6.25f)
            verticalLineToRelative(-1.5f)
            curveTo(17f, 4.336f, 16.664f, 4f, 16.25f, 4f)
            horizontalLineTo(3.75f)
            close()
            moveTo(4f, 8f)
            verticalLineToRelative(6f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineTo(8f)
            horizontalLineTo(4f)
            close()
        }
    }.build()
}
