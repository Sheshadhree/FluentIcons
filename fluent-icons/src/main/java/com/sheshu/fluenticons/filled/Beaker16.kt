package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Beaker16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Beaker16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(6f, 3f)
            verticalLineToRelative(3.689f)
            curveToRelative(0f, 0.443f, -0.117f, 0.877f, -0.34f, 1.26f)
            lineTo(5.045f, 9f)
            horizontalLineToRelative(5.908f)
            lineTo(10.34f, 7.949f)
            curveTo(10.117f, 7.566f, 10f, 7.132f, 10f, 6.689f)
            verticalLineTo(3f)
            horizontalLineToRelative(0.5f)
            curveTo(10.776f, 3f, 11f, 2.776f, 11f, 2.5f)
            reflectiveCurveTo(10.776f, 2f, 10.5f, 2f)
            horizontalLineToRelative(-5f)
            curveTo(5.224f, 2f, 5f, 2.224f, 5f, 2.5f)
            reflectiveCurveTo(5.224f, 3f, 5.5f, 3f)
            horizontalLineTo(6f)
            close()
            moveToRelative(5.537f, 7f)
            horizontalLineTo(4.463f)
            lineToRelative(-1.018f, 1.744f)
            curveTo(2.862f, 12.744f, 3.583f, 14f, 4.741f, 14f)
            horizontalLineToRelative(6.518f)
            curveToRelative(1.158f, 0f, 1.879f, -1.256f, 1.296f, -2.256f)
            lineTo(11.537f, 10f)
            close()
        }
    }.build()
}
