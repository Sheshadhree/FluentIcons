package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.FlagCheckered20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.FlagCheckered20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3.25f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            horizontalLineToRelative(10.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(10.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(6f)
            verticalLineToRelative(2.75f)
            curveTo(6f, 17.664f, 5.664f, 18f, 5.25f, 18f)
            reflectiveCurveTo(4.5f, 17.664f, 4.5f, 17.25f)
            verticalLineToRelative(-14f)
            close()
            moveTo(6f, 13f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(-3f)
            verticalLineTo(7f)
            horizontalLineToRelative(3f)
            verticalLineTo(4f)
            horizontalLineToRelative(-3f)
            verticalLineToRelative(3f)
            horizontalLineTo(9f)
            verticalLineTo(4f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3f)
            close()
        }
    }.build()
}
