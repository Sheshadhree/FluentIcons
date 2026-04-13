package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Branch24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Branch24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 5.5f)
            curveTo(4f, 3.567f, 5.567f, 2f, 7.5f, 2f)
            reflectiveCurveTo(11f, 3.567f, 11f, 5.5f)
            curveToRelative(0f, 1.59f, -1.06f, 2.932f, -2.511f, 3.358f)
            curveToRelative(0.688f, 2.253f, 2.783f, 3.892f, 5.261f, 3.892f)
            horizontalLineToRelative(0.33f)
            curveTo(14.425f, 11.177f, 15.825f, 10f, 17.5f, 10f)
            curveToRelative(1.933f, 0f, 3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveTo(19.433f, 17f, 17.5f, 17f)
            curveToRelative(-1.676f, 0f, -3.076f, -1.177f, -3.42f, -2.75f)
            horizontalLineToRelative(-0.33f)
            curveToRelative(-2.231f, 0f, -4.218f, -1.044f, -5.5f, -2.67f)
            verticalLineToRelative(3.5f)
            curveTo(9.823f, 15.425f, 11f, 16.825f, 11f, 18.5f)
            curveToRelative(0f, 1.933f, -1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(4f, 20.433f, 4f, 18.5f)
            curveToRelative(0f, -1.676f, 1.177f, -3.076f, 2.75f, -3.42f)
            verticalLineTo(8.92f)
            curveTo(5.177f, 8.575f, 4f, 7.175f, 4f, 5.5f)
            close()
        }
    }.build()
}
