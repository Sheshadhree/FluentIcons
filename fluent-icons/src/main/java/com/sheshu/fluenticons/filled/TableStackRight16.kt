package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.TableStackRight16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.TableStackRight16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 2.5f)
            curveTo(14f, 2.224f, 13.776f, 2f, 13.5f, 2f)
            reflectiveCurveTo(13f, 2.224f, 13f, 2.5f)
            verticalLineToRelative(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            reflectiveCurveToRelative(0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-11f)
            close()
            moveTo(10f, 11f)
            verticalLineToRelative(2.5f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(6f)
            verticalLineToRelative(-3f)
            horizontalLineToRelative(4f)
            close()
            moveToRelative(0f, -1f)
            verticalLineTo(6f)
            horizontalLineTo(6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(4f)
            close()
            moveTo(6f, 2f)
            horizontalLineToRelative(3.5f)
            curveTo(9.776f, 2f, 10f, 2.224f, 10f, 2.5f)
            verticalLineTo(5f)
            horizontalLineTo(6f)
            verticalLineTo(2f)
            close()
            moveTo(5f, 5f)
            verticalLineTo(2f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 2f, 2f, 3.12f, 2f, 4.5f)
            verticalLineTo(5f)
            horizontalLineToRelative(3f)
            close()
            moveTo(2f, 6f)
            verticalLineToRelative(4f)
            horizontalLineToRelative(3f)
            verticalLineTo(6f)
            horizontalLineTo(2f)
            close()
            moveToRelative(0f, 5.5f)
            verticalLineTo(11f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(3f)
            horizontalLineTo(4.5f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            close()
        }
    }.build()
}
