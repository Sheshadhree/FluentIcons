package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LinkSquare12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LinkSquare12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(0.998f, 3.248f)
            curveToRelative(0f, -1.243f, 1.007f, -2.25f, 2.25f, -2.25f)
            horizontalLineToRelative(2.504f)
            curveToRelative(1.213f, 0f, 2.203f, 0.961f, 2.248f, 2.163f)
            verticalLineToRelative(2.677f)
            curveTo(7.964f, 6.781f, 7.349f, 7.575f, 6.5f, 7.874f)
            lineToRelative(0.002f, -4.626f)
            curveToRelative(0f, -0.414f, -0.336f, -0.75f, -0.75f, -0.75f)
            horizontalLineTo(3.248f)
            curveToRelative(-0.414f, 0f, -0.75f, 0.336f, -0.75f, 0.75f)
            verticalLineToRelative(2.504f)
            curveToRelative(0f, 0.327f, 0.21f, 0.605f, 0.502f, 0.708f)
            verticalLineToRelative(1.528f)
            curveTo(1.874f, 7.865f, 0.998f, 6.91f, 0.998f, 5.752f)
            verticalLineTo(3.248f)
            close()
            moveTo(4f, 8.75f)
            curveTo(4f, 9.992f, 5.007f, 11f, 6.25f, 11f)
            horizontalLineToRelative(2.5f)
            curveTo(9.992f, 11f, 11f, 9.992f, 11f, 8.75f)
            verticalLineToRelative(-2.5f)
            curveToRelative(0f, -1.158f, -0.875f, -2.112f, -2f, -2.236f)
            verticalLineToRelative(1.529f)
            curveToRelative(0.291f, 0.103f, 0.5f, 0.38f, 0.5f, 0.707f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            horizontalLineToRelative(-2.5f)
            curveTo(5.836f, 9.5f, 5.5f, 9.164f, 5.5f, 8.75f)
            verticalLineTo(4.128f)
            curveTo(4.626f, 4.437f, 4f, 5.27f, 4f, 6.25f)
            verticalLineToRelative(2.5f)
            close()
        }
    }.build()
}
