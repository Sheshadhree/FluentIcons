package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.AlignCenterHorizontal28: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.AlignCenterHorizontal28",
        defaultWidth = 28.dp,
        defaultHeight = 28.dp,
        viewportWidth = 28f,
        viewportHeight = 28f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(26f, 13.75f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineTo(23f)
            verticalLineTo(18f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(16.231f, 20.75f, 15f, 19.519f, 15f, 18f)
            verticalLineToRelative(-3.5f)
            horizontalLineToRelative(-2f)
            verticalLineToRelative(6.25f)
            curveToRelative(0f, 1.519f, -1.231f, 2.75f, -2.75f, 2.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(6.231f, 23.5f, 5f, 22.269f, 5f, 20.75f)
            verticalLineTo(14.5f)
            horizontalLineTo(2.75f)
            curveTo(2.336f, 14.5f, 2f, 14.164f, 2f, 13.75f)
            reflectiveCurveTo(2.336f, 13f, 2.75f, 13f)
            horizontalLineTo(5f)
            verticalLineTo(7.25f)
            curveTo(5f, 5.731f, 6.231f, 4.5f, 7.75f, 4.5f)
            horizontalLineToRelative(2.5f)
            curveTo(11.769f, 4.5f, 13f, 5.731f, 13f, 7.25f)
            verticalLineTo(13f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(-3f)
            curveToRelative(0f, -1.519f, 1.231f, -2.75f, 2.75f, -2.75f)
            horizontalLineToRelative(2.5f)
            curveTo(21.769f, 7.25f, 23f, 8.481f, 23f, 10f)
            verticalLineToRelative(3f)
            horizontalLineToRelative(2.25f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            close()
        }
    }.build()
}
