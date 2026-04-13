package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.BranchFork24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.BranchFork24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(11f, 5.5f)
            curveToRelative(0f, 1.763f, -1.304f, 3.222f, -3f, 3.465f)
            verticalLineTo(11.5f)
            horizontalLineToRelative(6.25f)
            curveToRelative(1.243f, 0f, 2.25f, -1.007f, 2.25f, -2.25f)
            verticalLineTo(8.855f)
            curveTo(15.054f, 8.425f, 14f, 7.085f, 14f, 5.5f)
            curveTo(14f, 3.567f, 15.567f, 2f, 17.5f, 2f)
            reflectiveCurveTo(21f, 3.567f, 21f, 5.5f)
            curveToRelative(0f, 1.763f, -1.304f, 3.222f, -3f, 3.465f)
            verticalLineTo(9.25f)
            curveToRelative(0f, 2.071f, -1.679f, 3.75f, -3.75f, 3.75f)
            horizontalLineTo(8f)
            verticalLineToRelative(2.035f)
            curveToRelative(1.696f, 0.243f, 3f, 1.702f, 3f, 3.465f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(4f, 20.433f, 4f, 18.5f)
            curveToRelative(0f, -1.585f, 1.054f, -2.925f, 2.5f, -3.355f)
            verticalLineToRelative(-6.29f)
            curveTo(5.054f, 8.425f, 4f, 7.085f, 4f, 5.5f)
            curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
            reflectiveCurveTo(11f, 3.567f, 11f, 5.5f)
            close()
        }
    }.build()
}
