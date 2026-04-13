package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TextUnderlineCharacterU20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TextUnderlineCharacterU20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7f, 3.5f)
            curveTo(7f, 3.224f, 6.776f, 3f, 6.5f, 3f)
            reflectiveCurveTo(6f, 3.224f, 6f, 3.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 2.21f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            verticalLineTo(3.5f)
            curveTo(14f, 3.224f, 13.776f, 3f, 13.5f, 3f)
            reflectiveCurveTo(13f, 3.224f, 13f, 3.5f)
            verticalLineTo(10f)
            curveToRelative(0f, 1.657f, -1.343f, 3f, -3f, 3f)
            reflectiveCurveToRelative(-3f, -1.343f, -3f, -3f)
            verticalLineTo(3.5f)
            close()
            moveTo(5.5f, 16f)
            curveTo(5.224f, 16f, 5f, 16.224f, 5f, 16.5f)
            reflectiveCurveTo(5.224f, 17f, 5.5f, 17f)
            horizontalLineToRelative(9f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveTo(14.776f, 16f, 14.5f, 16f)
            horizontalLineToRelative(-9f)
            close()
        }
    }.build()
}
