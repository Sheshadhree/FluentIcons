package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Briefcase20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Briefcase20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 14f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            verticalLineToRelative(-3.356f)
            curveTo(2.733f, 11.474f, 3.805f, 12f, 5f, 12f)
            horizontalLineToRelative(4f)
            verticalLineToRelative(0.5f)
            curveTo(9f, 12.776f, 9.224f, 13f, 9.5f, 13f)
            horizontalLineToRelative(1f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(12f)
            horizontalLineToRelative(4f)
            curveToRelative(1.195f, 0f, 2.267f, -0.525f, 3f, -1.356f)
            verticalLineTo(14f)
            close()
            moveTo(11.25f, 2f)
            curveTo(12.216f, 2f, 13f, 2.784f, 13f, 3.75f)
            verticalLineTo(5f)
            horizontalLineToRelative(2f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            reflectiveCurveToRelative(-1.343f, 3f, -3f, 3f)
            horizontalLineToRelative(-4f)
            verticalLineToRelative(-0.5f)
            curveToRelative(0f, -0.276f, -0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1f)
            curveTo(9.224f, 10f, 9f, 10.224f, 9f, 10.5f)
            verticalLineTo(11f)
            horizontalLineTo(5f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            reflectiveCurveToRelative(1.343f, -3f, 3f, -3f)
            horizontalLineToRelative(2f)
            verticalLineTo(3.75f)
            curveTo(7f, 2.784f, 7.784f, 2f, 8.75f, 2f)
            horizontalLineToRelative(2.5f)
            close()
            moveToRelative(-2.5f, 1f)
            curveTo(8.336f, 3f, 8f, 3.336f, 8f, 3.75f)
            verticalLineTo(5f)
            horizontalLineToRelative(4f)
            verticalLineTo(3.75f)
            curveTo(12f, 3.336f, 11.664f, 3f, 11.25f, 3f)
            horizontalLineToRelative(-2.5f)
            close()
        }
    }.build()
}
