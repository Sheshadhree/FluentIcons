package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Beaker16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Beaker16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5.5f, 3f)
            horizontalLineTo(6f)
            verticalLineToRelative(3.689f)
            curveToRelative(0f, 0.443f, -0.117f, 0.877f, -0.34f, 1.26f)
            lineToRelative(-2.215f, 3.795f)
            curveTo(2.862f, 12.744f, 3.583f, 14f, 4.741f, 14f)
            horizontalLineToRelative(6.518f)
            curveToRelative(1.158f, 0f, 1.879f, -1.256f, 1.296f, -2.256f)
            lineTo(10.34f, 7.95f)
            curveTo(10.117f, 7.566f, 10f, 7.132f, 10f, 6.689f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.5f)
            curveTo(10.776f, 3f, 11f, 2.776f, 11f, 2.5f)
            reflectiveCurveTo(10.776f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 2f, 5f, 2.224f, 5f, 2.5f)
            reflectiveCurveTo(5.224f, 3f, 5.5f, 3f)
            close()
            moveTo(7f, 6.689f)
            verticalLineTo(3f)
            horizontalLineToRelative(2f)
            verticalLineToRelative(3.689f)
            curveToRelative(0f, 0.62f, 0.165f, 1.228f, 0.477f, 1.764f)
            lineTo(9.797f, 9f)
            horizontalLineTo(6.203f)
            lineToRelative(0.32f, -0.547f)
            curveTo(6.834f, 7.917f, 7f, 7.309f, 7f, 6.689f)
            close()
            moveTo(5.62f, 10f)
            horizontalLineToRelative(4.76f)
            lineToRelative(1.31f, 2.248f)
            curveTo(11.886f, 12.581f, 11.646f, 13f, 11.26f, 13f)
            horizontalLineTo(4.74f)
            curveToRelative(-0.386f, 0f, -0.626f, -0.419f, -0.432f, -0.752f)
            lineTo(5.62f, 10f)
            close()
        }
    }.build()
}
