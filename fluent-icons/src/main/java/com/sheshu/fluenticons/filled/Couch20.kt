package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Couch20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Couch20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 4f)
            horizontalLineTo(6f)
            curveTo(4.895f, 4f, 4f, 4.895f, 4f, 6f)
            verticalLineToRelative(1f)
            curveToRelative(1.307f, 0f, 2.417f, 0.835f, 2.829f, 2f)
            horizontalLineToRelative(6.342f)
            curveTo(13.583f, 7.835f, 14.693f, 7f, 16f, 7f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
            moveToRelative(2f, 4f)
            curveToRelative(-0.934f, 0f, -1.718f, 0.64f, -1.938f, 1.505f)
            curveTo(13.994f, 9.773f, 13.776f, 10f, 13.5f, 10f)
            horizontalLineToRelative(-7f)
            curveToRelative(-0.276f, 0f, -0.494f, -0.227f, -0.562f, -0.495f)
            curveTo(5.718f, 8.64f, 4.934f, 8f, 4f, 8f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            verticalLineToRelative(1.5f)
            curveTo(4f, 15.776f, 4.224f, 16f, 4.5f, 16f)
            reflectiveCurveTo(5f, 15.776f, 5f, 15.5f)
            verticalLineTo(14f)
            horizontalLineToRelative(10f)
            verticalLineToRelative(1.5f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineTo(14f)
            curveToRelative(1.105f, 0f, 2f, -0.895f, 2f, -2f)
            verticalLineToRelative(-2f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            close()
        }
    }.build()
}
