package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.OrganizationHorizontal20: ImageVector by
        lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.OrganizationHorizontal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(5f, 13f)
            curveToRelative(-1.657f, 0f, -3f, -1.343f, -3f, -3f)
            curveToRelative(0f, -1.658f, 1.343f, -3.001f, 3f, -3.001f)
            curveToRelative(1.487f, 0f, 2.722f, 1.081f, 2.96f, 2.5f)
            horizontalLineTo(9.5f)
            verticalLineToRelative(-3f)
            curveTo(9.5f, 5.671f, 10.172f, 5f, 11f, 5f)
            horizontalLineToRelative(1.041f)
            curveToRelative(0.238f, -1.42f, 1.473f, -2.501f, 2.96f, -2.501f)
            curveToRelative(1.657f, 0f, 3f, 1.343f, 3f, 3f)
            curveToRelative(0f, 1.658f, -1.343f, 3.001f, -3f, 3.001f)
            curveToRelative(-1.487f, 0f, -2.721f, -1.08f, -2.96f, -2.5f)
            horizontalLineTo(11f)
            curveToRelative(-0.276f, 0f, -0.5f, 0.224f, -0.5f, 0.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1.041f)
            curveToRelative(0.238f, -1.42f, 1.473f, -2.501f, 2.96f, -2.501f)
            curveToRelative(1.657f, 0f, 3f, 1.344f, 3f, 3f)
            curveToRelative(0f, 1.658f, -1.343f, 3.001f, -3f, 3.001f)
            curveToRelative(-1.487f, 0f, -2.721f, -1.08f, -2.96f, -2.5f)
            horizontalLineTo(11f)
            curveToRelative(-0.828f, 0f, -1.5f, -0.671f, -1.5f, -1.5f)
            verticalLineToRelative(-3f)
            horizontalLineTo(7.96f)
            curveTo(7.722f, 11.92f, 6.487f, 13f, 5f, 13f)
            close()
        }
    }.build()
}
